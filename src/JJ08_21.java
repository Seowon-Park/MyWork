//public class JJ08_21 {
//    public static void main(String[] args) {
//
//    }
//    static void startInstall() throws SpaceException,MemoryException{
//        if(!enoughSpace())
//            throw new SpaceException("설치할 공간이 부족합니다.");
//        if(!enoughMemory())
//            throw new MemoryException("메모리가 부족합니다.");
//    }
//    static void copyFiles(){}
//    static void deleteTempFiles(){}
//    static boolean enoughSpace(){
//        return false;
//    }
//    static boolean enoughMemory(){
//        return true;
//    }
//}
//class MemoryException extends Exception{
//    MemoryException(String msg){
//        super(msg);
//    }
//}
//class SpaceException extends Exception{
//    SpaceException(String msg){
//        super(msg);
//    }
//}
