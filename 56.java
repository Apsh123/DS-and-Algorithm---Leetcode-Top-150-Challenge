/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        
        List<Interval> res = new LinkedList<Interval>();
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare( Interval i1, Interval i2){
                return i1.start- i2.start;
            }
        });
        
        int i =0;
        while(i < intervals.size() -1){
            Interval curr = intervals.get(i);
            Interval next = intervals.get(i+1);
            if( curr. end >= next.start){
                int max = Math.max(curr.end, next.end);
                curr.end = max;
                intervals.remove(i+1);
            }
            else i++;
        }
        
        return intervals;
    }
}