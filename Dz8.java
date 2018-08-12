package ru.geekbrainz.homework;

public class Dz8 { */
    public class EndGame extends JPanel {
        private JLabel label;
        private JButton btn;
        private Game game;
        public EndGame(Game game) {
            this.label = new JLabel("asfds", SwingConstants.CENTER);
            this.game = game;
//        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setLayout(new BorderLayout());
            this.btn = new JButton("Play again");
            btn.addActionListener(new BtnListener());
            add(label, BorderLayout.CENTER);
            add(btn, BorderLayout.SOUTH);
        }
        public void setLabel(String winner) {
            this.label.setText(winner);
        }
        private class BtnListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.emptyBoard();
                CardLayout cl = (CardLayout) game.getContentPane().getLayout();
                cl.show(game.getContentPane(), "PLAY");
            }
        }
}
