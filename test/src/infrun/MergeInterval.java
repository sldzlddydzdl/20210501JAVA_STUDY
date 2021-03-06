package infrun;

import java.util.*;

/*
class Interval {
	int start;
	int end;
	
	Interval() {
		start = 0;
		end = 0;
	}
	Interval(int s, int e) {
		start = s;
		end = e;
	}
}
*/

public class MergeInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval in2 = new Interval(1,3);
		Interval in1 = new Interval(2,6);
		Interval in3 = new Interval(8,10);
		Interval in4 = new Interval(15,18);
		
		List<Interval> intervals = new ArrayList<>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);

		
		MergeInterval a = new MergeInterval();
		List<Interval> list = a.merge(intervals);
		System.out.println("====== result =======");
		a.print(list);
	}
	
	public List<Interval> merge(List<Interval> intervals){
		
		if(intervals.isEmpty()) return intervals;
		
		List<Interval> result = new ArrayList<>();
		
		print(intervals);
		
		Collections.sort(intervals, (a,b) -> a.start - b.start); // 오름차순
		// start값을기준으로 즉 첫번째 기준
		/* 결과
	// 기준
		1 	3
		2 	10
		8 	6
		15 	18
		*/
		
		
	//	Collections.sort(intervals, (a,b) -> b.start - a.start); // 내림차순
		// start값을기준으로 즉 첫번째 기준
		/* 결과
	// 기준
		15 	18
		8 	6
		2 	10
		1 	3
		*/
		
	//	Collections.sort(intervals, (b,a) -> b.end - a.end); // 오름차순
		// end값을 기준으로 즉 두번째 기준
		/* 결과
	//     기준
		1	3
		8 	6
		2 	10
		15 	18
		*/
		
	//	Collections.sort(intervals, (b,a) -> a.end - b.end); // 내림차순
		// end값을 기준으로 즉 두번째 기준
		/* 결과
	//     기준
		15	18
		2 	10
		8 	6
		1 	3
		*/
		

		
		System.out.println("========");
		print(intervals);
		
	//	Collections.sort(intervals, comp); // 오름차순
		
	// Collections.sort() -> list;
	// Arrays.sort() -> array(배열);
		
		Interval before = intervals.get(0);
		for(int i = 1;  i< intervals.size(); i++) {
			Interval current = intervals.get(i);
			if(before.end >= current.start) {
				before.end = Math.max(before.end, current.end);
			}
			else {
				result.add(before);
				before = current;
			}
		}
		
		if(!result.contains(before)) {
			result.add(before);
		}
		
		
		return result;
		
		
	}
	
	
	
	void print(List<Interval> list) {
		for(int i = 0 ; i < list.size(); i++) {
			Interval in = list.get(i);
			System.out.println(in.start + " " + in.end);
		}
	}
	
	Comparator comp = new Comparator<Interval>() {
		
		public int compare(Interval a, Interval b) {
			
			return a.start - b.start;
			
		};
		
	};

}
