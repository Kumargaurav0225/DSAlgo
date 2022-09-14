//package prac.misc;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class NearestMatch {
//    public static void main(String[] args){
//        int result = frequent(3.490);
//    }
//
//    public static int frequent(double k){
//        List<Double> list = Arrays.asList(6.564, 1.234, 3.445, 3.456 , 3.501, 4.563);
//        Map<Double,Integer> map = new TreeMap<>();
//
//        for(int i=0;i<list.size();i++){
//            map.put(list.get(i),i);
//        }
//        if(map.get(k) != null){
//            return map.get(k);
//        }else{
//            int ceil = map.
//            int floor = map.get(k);
////            int diffOfCeilNKey =  list.get(ceil)-k;
////            int diffOfFloorNKey = k- list.get(ceil);
//            return  (diffOfCeilNKey<diffOfFloorNKey)? ceil: floor;
//        }
//
//    }
//
//}
