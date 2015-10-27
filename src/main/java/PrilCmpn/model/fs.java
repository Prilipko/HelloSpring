package PrilCmpn.model;

import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * Created by Alexander on 26.10.2015.
 */

public interface Fs {
    List<String> getDirectories(String path);
    List<String> getFiles(String path);
}
