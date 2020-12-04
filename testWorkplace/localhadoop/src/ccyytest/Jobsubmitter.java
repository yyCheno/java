package ccyytest;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class Jobsubmitter {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		// TODO Auto-generated method stub

			Configuration conf = new Configuration();//实例化，从Hadoop的配置文件里读取参数
			conf.set("mapreduce.app-submission.cross-platform", "true");
			 @SuppressWarnings("deprecation")
			Job job = new Job(conf, "1j-FindMaxTemp");//job_name = "wordcount"    
			 job.setJarByClass(Jobsubmitter.class);//输入    

		     

			 job.setMapperClass(FindMaxTempMapper.class);  //输入  
			 job.setReducerClass(FindMaxTempReducer.class);   //输入
			 job.setOutputKeyClass(Text.class);    //输出
			 job.setOutputValueClass(IntWritable.class); //输出   
			 FileInputFormat.addInputPath(job, new Path("hdfs://master:9000/gsod/1929/030050-99999-1929.op"));//输入文件，端口默认9000，具体看集群配置
			 FileOutputFormat.setOutputPath(job, new Path("hdfs://master:9000/1j/output-FindMaxTemp-13"));//输出文件    
			 System.exit(job.waitForCompletion(true) ? 0 : 1);//若执行完毕，退出
	}

}