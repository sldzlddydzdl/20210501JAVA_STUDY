package infrun;

import java.util.*;

public class MeetingRoom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Interval> list = new ArrayList<>();
		
		 
		
		
		MeetingRoom2 a = new MeetingRoom2();
		
		Interval in1 = new Interval(5,10);
		Interval in2 = new Interval(0,30);
		Interval in3 = new Interval(15,20);
		
		list.add(in1);
		list.add(in2);
		list.add(in3);
		
		Interval[] intervals = new Interval[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			intervals[i] = list.get(i);
		}
		
		int result = a.solve(intervals);

		System.out.println(result);
		
	}
	
	public int solve(Interval[] intervals) {
		
		
		/* 나의 풀이
		int result = 0 ;
		
		Arrays.sort(intervals, (a, b) -> a.start - b.start);
		
		print(intervals);
		
		ArrayList<Interval> answer = new ArrayList<>();
		
		for(int i = 1 ; i < intervals.length; i++) {
			if(intervals[i-1].end <= intervals[i].start) {
				Interval out1 = new Interval(intervals[i-1].start , intervals[i].end);
				answer.add(out1);
			}
			else {
				result++;
			}
		}
		
		result += answer.size();
		
		return result;
		*/
		
		// Queue , PriorityQueue 사용 
		
		if(intervals == null || intervals.length == 0) return 0;
		
		
		
		// 1. data
		Arrays.sort(intervals, (a ,b) -> (a.start - b.start));
		
		print(intervals);
		
		Queue<Interval> minHeap = new PriorityQueue<>(intervals.length , (a,b) -> (a.end - b.end));
		// minHeap binary tree 구조에서 맨위에서 아래로 내려가는순으로 오름차순으로 한다.
		
		
		
		
		int max = 0;
		
		
		
		// 2. for
		for(int i  = 0 ; i < intervals.length; i++) {
			while(!minHeap.isEmpty() && minHeap.peek().end <= intervals[i].start) {
				minHeap.poll();
			}
			minHeap.offer(intervals[i]); // 0 30 , 5 10 , 15 20
			System.out.println(minHeap.peek());
			 //max = Math.max(max, minHeap.size());
		}
		
	

		return minHeap.size();
		
		
	}
	
	
	public void print(Interval[] intervals) {
		
		
	
		for(int i  = 0 ; i < intervals.length; i++) {
			Interval in = intervals[i];
			System.out.println(in.start + " " + in.end);
		}
	}

	
}


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

