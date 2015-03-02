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

/**
 *
 * @author FiskFisk33
 */
public class Converter {

    private File[] files;
    private File dir;
    private int quality = 0;

    public boolean convert(File f)throws Exception {
            String lamePath = LameExe.getPath();
            String newName = f.getName().replace(".wav",".mp3");
            System.out.println(lamePath);
            System.out.println("newName");
            
            
                    
            Process p = Runtime.getRuntime().exec("cmd /C start " + lamePath + " -V"+quality+" -q0 \"" + f + "\" \"" + dir + "\\" + newName + "\"");
            System.out.println("cmd /C start " + lamePath + " -V"+quality+" \"" + f + "\" \"" + dir + "\\" + newName + "\"");
        return true;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }
    
    public void setQuality(int q) {
        this.quality = q;
    }
    

    public void setDir(File dir) {
        this.dir = dir;
    }

    public File[] getFiles() {
        return files;
    }

    public File getDir() {
        return dir;
    }

    public boolean ready() {
        return (files != null) && (files.length > 0) && (dir != null) && (dir.isDirectory());
    }
}
