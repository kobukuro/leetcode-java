public class MaximumNumberOfWordsFoundInSentences2114 {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for (int i = 0; i < sentences.length; i++) {
            int numWords = sentences[i].split(" ").length;
            res = Math.max(res, numWords);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        // 6
        System.out.println(new MaximumNumberOfWordsFoundInSentences2114().mostWordsFound(sentences));
    }
}
