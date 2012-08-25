/**
 * @author cloudera
 * @date 14-Aug-12
 *
 */
package source;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.io.compress.CompressionCodecFactory;
import org.apache.hadoop.io.compress.CompressionCodec;

import org.apache.hadoop.io.compress.DeflateCodec;
import org.apache.hadoop.io.compress.BZip2Codec;
import org.apache.hadoop.io.compress.GzipCodec;
import org.apache.hadoop.io.compress.SnappyCodec;
import com.hadoop.compression.lzo.LzoCodec;

public class HdfsCompressionWriter {
	private String codecName;
	private String hdfsUrl;
	private String sourceFile;
	private String targetFile;
	
	private Configuration hdfsConf;
	private CompressionCodec codec;
}
