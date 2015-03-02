package fisklame;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class LameExe
{
    private static URI lamePath;
    private static boolean init = false;
    
    public static void init()
        throws URISyntaxException,
               ZipException,
               IOException
    {
        final URI uri;
        final URI exe;

        uri = getJarURI();
        exe = getFile(uri, "external_binaries/lame.exe");
        System.out.println(exe);
        lamePath = exe;
        init = true;
    }
    public static String getPath(){
        if(!init){
            try{
            init();
            }catch(Exception e){}
        }
        return lamePath.toString();
    }

    private static URI getJarURI()
        throws URISyntaxException
    {
        final ProtectionDomain domain;
        final CodeSource       source;
        final URL              url;
        final URI              uri;

        domain = LameExe.class.getProtectionDomain();
        source = domain.getCodeSource();
        url    = source.getLocation();
        uri    = url.toURI();

        return (uri);
    }

    private static URI getFile(final URI    where,
                               final String fileName)
        throws ZipException,
               IOException
    {
        final File location;
        final URI  fileURI;

        location = new File(where);

        // not in a JAR, just return the path on disk
        if(location.isDirectory())
        {
            fileURI = URI.create(where.toString() + fileName);
        }
        else
        {
            final ZipFile zipFile;

            zipFile = new ZipFile(location);

            try
            {
                fileURI = extract(zipFile, fileName);
            }
            finally
            {
                zipFile.close();
            }
        }

        return (fileURI);
    }

    private static URI extract(final ZipFile zipFile,
                               final String  fileName)
        throws IOException
    {
        final File         tempFile;
        final File         tempDir;
        final ZipEntry     entry;
        final InputStream  zipStream;
        OutputStream       fileStream;
        System.out.println(fileName);
        tempFile = File.createTempFile("tmp",".exe");
        //tempFile.createNewFile();
        tempFile.deleteOnExit();
        entry    = zipFile.getEntry(fileName);
        
        System.out.println("111: " + tempFile);

        if(entry == null)
        {
            throw new FileNotFoundException("cannot find file: " + fileName + " in archive: " + zipFile.getName());
        }

        zipStream  = zipFile.getInputStream(entry);
        fileStream = null;

        try
        {
            final byte[] buf;
            int          i;

            fileStream = new FileOutputStream(tempFile);
            buf        = new byte[1024];
            i          = 0;

            while((i = zipStream.read(buf)) != -1)
            {
                fileStream.write(buf, 0, i);
            }
        }
        finally
        {
            close(zipStream);
            close(fileStream);
        }
        System.out.println("140: " + tempFile.toURI());
        return (tempFile.toURI());
    }

    private static void close(final Closeable stream)
    {
        if(stream != null)
        {
            try
            {
                stream.close();
            }
            catch(final IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}