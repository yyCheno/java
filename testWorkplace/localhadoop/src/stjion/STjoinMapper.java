package stjion;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class STjoinMapper extends Mapper<LongWritable, Text, Text, Text> {
	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String line = value.toString();
		String[] values = line.split("\\s+");
		context.write(new Text(values[1]), new Text(values[0]+"L"));
		context.write(new Text(values[0]), new Text(values[1]+"R"));
	}
}
