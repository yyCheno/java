package dataunique;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class DedupReducer extends Reducer<Text, Text,Text, Text> {
@Override
protected void reduce(Text key, Iterable<Text> value, Context context)
		throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	context.write(key, new Text(""));
}
}
