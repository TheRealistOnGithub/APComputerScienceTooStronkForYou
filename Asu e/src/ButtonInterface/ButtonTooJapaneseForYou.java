package ButtonInterface;


import java.io.IOException;

class ButtonTooJapaneseForYou implements Button {
    public int state = 0;

    public void push() {

        String[] urls = new String[5];
        urls[0] = "https://www.youtube.com/watch?v=X5cO8Ak8BjE";
        urls[1] = "https://www.youtube.com/watch?v=pCSb5Jr_1Z0";
        urls[2] = "https://www.youtube.com/watch?v=J8FpKAsd85w";
        try {
            for (int i = 0; i < 3; i++) {
                if (i == 0) {

                    Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start chrome", urls[0]});

                } else if (i == 1) {
                    Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start chrome", urls[1]});

                }else if (i == 2) {
                    Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start chrome", urls[3]});
                    i = i - 2;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        state++;
    }


    public String state() {
        String s = "The button has been pushed " + state + " times. Good Job for watching the video " + state + " times and supporting the creator!";
        return s;

    }

}
