public class BMmatch {
    //Boyer Moore법
    //패턴의 마지막 문자부터 앞쪽에서 검사를 진행하며 일치하지 않는 문자가 있으면 옮긴다.
    static int bmMatch(String txt, String pat) {
        int pt;
        int pp;
        int txtLen = txt.length();
        int patLen = pat.length();
        int[] skip = new int[Character.MAX_VALUE + 1];

        for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
            skip[pt] = patLen;
        }
        for (pt = 0; pt < patLen - 1; pt++) {
            skip[pat.charAt(pt)] = patLen - pt - 1;
        }
        while (pt < txtLen) {
            pp = patLen - 1;
            while (txt.charAt(pt) == pat.charAt(pp)) {
                if (pp == 0) {
                    return pt;
                }
                pp--;
                pt--;
            }
            pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
        }
        return -1;
    }
}
