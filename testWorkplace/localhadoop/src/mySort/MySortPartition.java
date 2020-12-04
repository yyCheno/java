package mySort;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class MySortPartition extends Partitioner<IntWritable,IntWritable> {

	@Override
	public int getPartition(IntWritable key, IntWritable value, int num) {
		// TODO Auto-generated method stub
		int maxnumber = 65223;
		int bound = maxnumber/num + 1;
		int keynumber = key.get();
		for (int i = 0; i < num; i++) {
			if(keynumber<bound*i&&keynumber>=bound*(i-1)) return i-1;
		}
		return -1;
	}

}
