/**
 * 
 */
package br.com.rafaj2ee.util;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Filtering of jar files
 */
public class JarFilter implements FilenameFilter {
    private SourceFileSelector fileSelector;

    private static final String fileSeparator = System.getProperty("file.separator");
	/**
     * Public constructor
     *
     * @param fileSelector the FileSelector that knows what files to accept
     */
    public JarFilter(SourceFileSelector fileSelector) {
        this.fileSelector = fileSelector;
    }
    public boolean accept(File dir, String filename) {
        return filename.indexOf(".jar")==-1;
    }
}