package archive;

import archive.tool.console.Settings;
import archive.tool.core.impl.ZipDecompressor;
import org.junit.Test;

public class DecompressorTest {

    @Test
    public void shouldDecompress() throws Exception {
        System.out.println("Start decompress test");

        Settings.inputUnzipDir = "/Users/kumaryadav/Desktop/JustExampleFolder/out";
        Settings.outputUnzipDir = "/Users/kumaryadav/Desktop/JustExampleFolder/in_1";

        ZipDecompressor decompressor = new ZipDecompressor();
        decompressor.decompress();
        System.out.println("Done");
    }
}