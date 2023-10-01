package lv1;

import java.util.*;
import java.util.stream.*;

public class 신고결과받기 {
    public int[] solution(String[] idList, String[] report, int k){
        int[] answer = new int[idList.length];
        HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
        HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
        List<String> reportList = Arrays.stream(report).distinct().collect(Collectors.toList());

        for(String reportInfo : reportList){
            String reporter = reportInfo.split(" ")[0];
            String reported = reportInfo.split(" ")[1];
            reporterInfoMap.putIfAbsent(reporter, new HashSet<>(){ {add(reported);} });
            reporterInfoMap.get(reporter).add(reported);
            reportedCountInfoMap.put(reported, reportedCountInfoMap.getOrDefault(reported, 0)+1);
        }

        for (String reported : reportedCountInfoMap.keySet()){
            int reportedCount = reportedCountInfoMap.get(reported);
            if(reportedCount >= k){

                for(int i=0; i<idList.length; i++){
                    if(reporterInfoMap.containsKey(idList[i]) && reporterInfoMap.get(idList[i]).contains(reported)) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }
}
