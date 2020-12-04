package mySort;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class MySortReducer extends Reducer<IntWritable, IntWritable, IntWritable, IntWritable> {
	private static IntWritable num = new IntWritable(1);
	@Override
	protected void reduce(IntWritable key, Iterable<IntWritable> values,Context context)throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		for (@SuppressWarnings("unused") IntWritable value : values) {
			context.write(num, key);
			num = new IntWritable(num.get()+1);
		}
	}
}
