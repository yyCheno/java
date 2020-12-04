package dataunique;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class DedupMapper extends Mapper<Object, Text, Text, Text> {
	private static Text line = new Text();
	@Override
	protected void map(Object key, Text value, Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		line = value;
		context.write(line, new Text(""));
	}
}
