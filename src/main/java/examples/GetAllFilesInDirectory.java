package examples;

import java.io.File;
import java.io.IOException;
import java.util.List;

import PrilCmpn.model.Fs;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class GetAllFilesInDirectory {

    public static void main(String[] args) throws IOException {

        File dir = new File("c:\\tmp");

        System.out.println("Getting all files in " + dir.getCanonicalPath() + " including those in subdirectories");
        List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
        for (File file : files) {
            System.out.println("file: " + file.getCanonicalPath());
        }

    }

}