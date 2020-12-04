package stjion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class STjoinReducer extends Reducer<Text, Text, Text, Text> {
	
		@Override
		protected void reduce(Text key, Iterable<Text> values, Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			 List<String> c = new ArrayList<String>();
			 List<String> g = new ArrayList<String>();
			for (Text value: values) {
				String v = value.toString();
				if(v.substring(v.length()-1,v.length()).equals("L")) {
					c.add(v.substring(0,v.length()-1));
					
				}else {
					g.add(v.substring(0,v.length()-1));
					
				}
			}
			for (String cstring : c) {
				for (String gstring : g) {
					context.write(new Text(cstring),new Text(gstring));
				}
			}
		}

}
