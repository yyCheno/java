package mySort;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class Jobsubmitter {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		// TODO Auto-generated method stub

			Configuration conf = new Configuration();//ʵ��������Hadoop�������ļ����ȡ����
			conf.set("mapreduce.app-submission.cross-platform", "true");
			 @SuppressWarnings("deprecation")
			Job job = new Job(conf, "1j-MySort");//job_name = "wordcount"    
			 job.setJarByClass(Jobsubmitter.class);//����    

		     

			 job.setMapperClass(MySortMapper.class);  //����  
			 job.setReducerClass(MySortReducer.class);   //����
			 job.setOutputKeyClass(IntWritable.class);    //���
			 job.setOutputValueClass(IntWritable.class); //���  
			 job.setCombinerClass(MySortReducer.class);
			 job.setPartitionerClass(MySortPartition.class);
			 FileInputFormat.addInputPath(job, new Path("D://something/sort.txt"));//�����ļ����˿�Ĭ��9000�����忴��Ⱥ����
			 FileOutputFormat.setOutputPath(job, new Path("D://something/sortout"));//����ļ�    
			 System.exit(job.waitForCompletion(true) ? 0 : 1);//��ִ����ϣ��˳�
	}

}