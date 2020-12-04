package mySort;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MySortMapper extends Mapper<LongWritable, Text, IntWritable, IntWritable> {
	IntWritable intvale = new IntWritable();
	@Override
	protected void map(LongWritable key, Text value,Context context)throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	String line = value.toString();
	intvale.set(Integer.parseInt(line));
	context.write(intvale, new IntWritable(1));
}
}
