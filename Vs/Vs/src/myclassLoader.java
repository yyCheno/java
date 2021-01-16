import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.Buffer;

public class myclassLoader extends ClassLoader{
    private String byteCodePath;

    public myclassLoader(String Path){
        this.byteCodePath = Path;
    }

    public myclassLoader(ClassLoader paraent,String Path){
        super(paraent);
        this.byteCodePath = Path;
    }

    @Override
    protected Class<?> findClass(String name)  {
        BufferedInputStream bis =null;
        ByteArrayOutputStream bos  = null;

        String fullname = byteCodePath+name+".class";
        System.out.println(fullname);
        try{
        bis = new BufferedInputStream(new FileInputStream(fullname));
        bos = new ByteArrayOutputStream();
        
        int len;
        byte[] data = new byte[1024];
        while((len = bis.read(data))!=-1){
            bos.write(data, 0, len);
        }
        byte[] dataout = bos.toByteArray();
        return defineClass(null, dataout, 0,dataout.length);
    }catch(Exception e){
            e.printStackTrace();
    }finally{
        try{
        bis.close();
        bos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        return null;
    }
}
