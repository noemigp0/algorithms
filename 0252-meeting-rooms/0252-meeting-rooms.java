class Solution {
    public boolean canAttendMeetings(int[][] intervals) {

        //   0 1
        //0 [0,30]   {0,0},{0,1}
        //   #
        //1 [5,10]   {1,0},{1,1}
        //2 [15,20]  {2,0},{2,1}

        //0 [2,4]    {0,0},{0,1}
        //1 [7,10]   {1,0},{1,1}

        //0 [13,15],  {0,0},{0,1}
        //1 [1,13],   {1,0},{1,1}
        //2 [46,50]  {2,0},{2,1}

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int intervalsLen = intervals.length;

        for (int row = 0; row < intervalsLen - 1; row++) {
            for (int col = 0; col < intervals[row].length; col++) {

                if (col == intervals[row].length-1 ) {
                    if (intervals[row][col] > intervals[row + 1][0]) {
                        return false;
                    }
                }

                //row = 0 col = 1
                //row = 1 col = 0

                //row = 1 col = 1;
                //rom = 2 col = 1

            }
        }

        return true;

    }
}