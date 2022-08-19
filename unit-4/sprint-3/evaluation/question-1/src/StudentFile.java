import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFile {
    public static void main(String[] args) throws IOException {
        BufferedReader objReader=new BufferedReader(new FileReader("C:\\Users\\VIKAS\\Desktop\\pushpam_fw19_1155\\unit-4\\sprint-3\\evaluation\\question-1\\src\\student.txt"));
        String str;
        List<Student> studentList=new ArrayList<>();
        int count=0;
        Student student=new Student();

        while((str=objReader.readLine())!=null){
            if(count%6==0){
                student=new Student();
                student.setName(str);
            } else if (count%6==5) {
                student.addMarks(Integer.parseInt(str));
                studentList.add(student);
            }
            else {
                student.addMarks(Integer.parseInt(str));
            }
            count++;
        }

        PrintWriter printWriter=new PrintWriter("C:\\Users\\VIKAS\\Desktop\\pushpam_fw19_1155\\unit-4\\sprint-3\\evaluation\\question-1\\src\\reportCard.txt");
        for(int i=0;i<studentList.size();i++){
            int totalMarks=studentList.get(i).getTotalMarks();
            int avg=totalMarks/studentList.get(i).getMarks().size();
            printWriter.println(studentList.get(i).getName()+"Total Marks= "+totalMarks+" and average = "+avg);
        }
        printWriter.close();

    }

}
