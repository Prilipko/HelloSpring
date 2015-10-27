package PrilCmpn.model;

import java.util.List;

/**
 * Created by Alexander on 26.10.2015.
 */
public interface fs {
    List<String> getDirectories(String path);
    List<String> getFiles(String path);
}
