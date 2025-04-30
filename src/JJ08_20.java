//public class JJ08_20 {
//    public static void main(String[] args) {
//        try(CloseableResource cr = new CloseableResource()){
//            cr.exceptionWork(false);//cr 객체에 대한 예외가 발생하지 않는다.
//        }catch(WorkException e){
//            e.printStackTrace(System.out);
//        }catch(CloseException e){
//            e.printStackTrace(System.out);
//        }
//        System.out.println();
//
//        try(CloseableResource cr = new CloseableResource()){
//            cr.exceptionWork(true);//cr 객체에 대한 예외가 발생한다.
//        }catch(WorkException e){
//            e.printStackTrace(System.out);
//        }catch(CloseException e){
//            e.printStackTrace(System.out);
//        }
//    }
//}
//class CloseableResource implements AutoCloseable{
//    public void exceptionWork(boolean exception) throws WorkException {
//        System.out.println("exceptionWrk(" + exception + ")가 호출됨");
//        if(exception)
//            throw new WorkException("WorkException 발생!!!");
//    }
//    public void close() throws CloseException{
//        System.out.println("close()가 호출됨");
//        throw new WorkException("WorkException 발생!!!");
//    }
//}
//class WorkException extends Exception{
//    WorkException(String msg){super(msg);}
//}
//class CloseException extends Exception{
//    CloseException(String msg) {super(msg);}
//}