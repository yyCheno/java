package ccyytest;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class FindMaxTempReducer extends Reducer<Text,DoubleWritable,Text,DoubleWritable> {
    @Override
    protected void reduce(Text key,Iterable<DoubleWritable> values,Context context) throws IOException, InterruptedException {
    	// TODO Auto-generated method stub
    	Double maxValue = Double.MIN_VALUE;
    	for (DoubleWritable value : values) {
			maxValue = Math.max(maxValue, value.get());
			System.out.println(maxValue);
		}
    	context.write(key, new DoubleWritable(maxValue));
    }
}

