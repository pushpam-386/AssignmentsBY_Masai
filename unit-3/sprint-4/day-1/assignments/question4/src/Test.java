public class Test implements Intr{
    @Override
    public int[] display(int p) {
        int pos=0;
        int a[] = new int[p];
        for(int i=2;i<=p;i++){
            int count=0;
            for(int y=2;y<=i/2;y++){
                if(i%y==0){
                    count=1;
                    break;
                }
            }
            if(count==0){
                a[pos++]=i;
            }
        }
        int result[] = new int[pos];
        for(int i =0;i<pos;i++){
            result[i]=a[i];
        }
        return result;
    }
}
