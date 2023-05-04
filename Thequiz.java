import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;



public class Thequiz extends JFrame
{
    
    public static void main(String[] args)
    {
        Themain();
    }
        
    public static void Themain()
    {
        //create main frame
        JFrame screen = new JFrame("Environmental Stewardship");
        screen.setSize(1500, 1000);
 
        //create main menu header
        JLabel headerLabel = new JLabel("Environemtal Stewardship Program");
        headerLabel.setBounds(480, 100, 600, 50);
        headerLabel.setFont(new Font("serif", Font.PLAIN, 30));
        screen.add(headerLabel);
    
        //set background colour
         Container cp = screen.getContentPane();
         cp.setBackground(new Color(144, 238, 144));
        
        //create text area 
        JTextArea text = new JTextArea("\n Production of technology contributes to pollution and the depletion of natural resources such as precious metals (gold, silver, platinum). Air pollution occurs when harmful\n quantities of gasses are introduced into the earth's atmosphere and the leading cause of this stems from technology such as vehicles that burn fossil fuels and power stations\n that use technological turbines. The consequences of air pollution can and will lead to negative impacts on the environment by causing global warming, harming many natural ecosystems\n that are home to wildlife. Pollution also has a lot of negative health impacts on humans such as respiratory infections, heart diseases, and lung cancer. Not only does the production of\n technologies impact human health, but so does the usage. Many modern day technologies such as mobile devices are being heavily overused, negatively impacting human behavior\n like mental health. However, technology is the foundation to today’s society and contributes to many positive results. Technology is used to enhance education, communication,\n medical research, production expansion, safety, businesses, human efficiency, etc.\n\n Societies and communities as a whole can help reduce various negative effects of technology by keeping small initiatives in mind. This can include switching to renewable energy,\n switching technology off when not being used, purchasing an electric car instead, and reducing the amount of technology being bought. To decrease negative impacts on human mental\n health, it is important for people to be mindful of how they use their technologies. People should remember to limit their usage of mobile technology to complete important tasks and\n understand the negative effects of technologies.  ");
        text.setBounds(200, 200, 1000, 300);
        text.setEditable(false);
        screen.add(text);

        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setResizable(false);
        screen.setVisible(true);
        
        //set button that leads to next window
        JButton scnd_wind = new JButton("Continue");
        scnd_wind.setBounds(580, 550, 250, 50);
        screen.add(scnd_wind);

        scnd_wind.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                screen.dispose();
                scnd_screen();
            }
        });
    }
    
    public static void scnd_screen()
    {
        JFrame instr = new JFrame("Initiatives");
        instr.setSize(1500,1000);

        JButton goBack = new JButton("Go back");
        goBack.setBounds(75,50,200,50);
        instr.add(goBack);
        goBack.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                instr.dispose();
                Themain();
            }
        });

        Container sp = instr.getContentPane();
        sp.setBackground(new Color(144, 238, 144));


        JLabel title2 = new JLabel("Resources and Current Initiatives to Sustain Environmental Stewardship");
        title2.setBounds(320, 100, 1000, 50);
        title2.setFont(new Font("serif", Font.PLAIN, 30));
        instr.add(title2);

        JTextArea ini = new JTextArea("\n Global Initiatives:\n \n\n The United Nations framework convention on climate change (since 1972) was created to stabilize greenhouse gas emissions at a level that would prevent\n human induced interference with climate change.\n\n By building consensus and negotiating agreements, the UN is able to tackle global climate change issues caused by e-waste such as ozone layer\n depletion, toxic waste, loss of forests and biodiversity, and air + water pollution.\n\n Local Initiatives:\n\n You can contribute to environmental stewardship right now by:\n\n Recycling your e-waste at a local staples (for free)\n\n Going to Canada Computer / BestBuy to refurbish or repair your computer\n\n Buy toys from Green toys (made out of recycled milk jugs)\n\n  Buy a samsung phone which now includes more sustainable semiconductors called “green chips”");
        ini.setBounds(250, 200, 1000,500);
        ini.setEditable(false);
        instr.add(ini);

        JButton thrd_wind = new JButton("QUIZ TIME");
        thrd_wind.setBounds(600, 800, 300, 100);
        instr.add(thrd_wind);

        thrd_wind.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                instr.dispose();
                thrd_screen();
            }
        });


        instr.setLayout(null);
        instr.setResizable(false);
        instr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instr.setVisible(true);
    }

    public static void thrd_screen()
    {
        JFrame quiz = new JFrame("Quiz");
        quiz.setSize(1500,1000);

        JButton go_Back = new JButton("Go back");
        go_Back.setBounds(75,50,200,50);
        quiz.add(go_Back);
        go_Back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                quiz.dispose();
                scnd_screen();
            }
        });

        //set background
        Container dp = quiz.getContentPane();
        dp.setBackground(new Color(144, 238, 144));
       
        //create first question
        JLabel ques_1 = new JLabel ("how can pollution harm humans?");
        ques_1.setBounds(250,150,300,30);
        quiz.add(ques_1);

        //create confirm bts
        JButton confirm_1 = new JButton("Confirm Answer");
        confirm_1.setBounds(250,410,200,30);
        quiz.add(confirm_1);
        confirm_1.addActionListener(null);
    
        //create options 
        JRadioButton a1 = new JRadioButton("Cause heart disease");
        a1.setBounds(250,200,300,50);
        quiz.add(a1);

        JRadioButton a2 = new JRadioButton("Cause lung cancer");
        a2.setBounds(250, 250, 300, 50);
        quiz.add(a2);

        JRadioButton a3 = new JRadioButton("Cause respiratory issues");
        a3.setBounds(250,300,300,50);
        quiz.add(a3);

        JRadioButton a4 = new JRadioButton("All of the above");
        a4.setBounds(250,350,300,50);
        quiz.add(a4);

        
        ButtonGroup bg = new ButtonGroup();
        bg.add(a1);
        bg.add(a2);
        bg.add(a3);
        bg.add(a4);


         confirm_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(a4.isSelected())
                {
                   JOptionPane.showMessageDialog(null, "correct");

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"incorrect");
                }
            }
        });

        //create second question
        JLabel ques_2 = new JLabel ("How can you prevent technology from harming you?");
        ques_2.setBounds(250,500,400,30);
        quiz.add(ques_2);

        //create confirm bts
        JButton confirm_2 = new JButton("Confirm Answer");
        confirm_2.setBounds(250,760,200,30);
        quiz.add(confirm_2);
        confirm_2.addActionListener(null);
    
        //create options 
        JRadioButton b1 = new JRadioButton("Limit phone usage");
        b1.setBounds(250,550,300,50);
        quiz.add(b1);

        JRadioButton b2 = new JRadioButton("Go on your phone more");
        b2.setBounds(250, 600, 300, 50);
        quiz.add(b2);

        JRadioButton b3 = new JRadioButton("buy more technology");
        b3.setBounds(250,650,300,50);
        quiz.add(b3);

        JRadioButton b4 = new JRadioButton("All of the above");
        b4.setBounds(250,700,300,50);
        quiz.add(b4);

        
        ButtonGroup cg = new ButtonGroup();
        cg.add(b1);
        cg.add(b2);
        cg.add(b3);
        cg.add(b4);


         confirm_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(b1.isSelected())
                {
                   JOptionPane.showMessageDialog(null, "correct");

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"incorrect");
                }
            }
        });

        //create third question
        JLabel ques_3 = new JLabel ("How long has the UN been working to promote enviromental stewardship?");
        ques_3.setBounds(700,150,450,30);
        quiz.add(ques_3);

        //create confirm bts
        JButton confirm_3 = new JButton("Confirm Answer");
        confirm_3.setBounds(700,410,200,30);
        quiz.add(confirm_3);
        confirm_3.addActionListener(null);
    
        //create options 
        JRadioButton c1 = new JRadioButton("10 years");
        c1.setBounds(700,200,300,50);
        quiz.add(c1);

        JRadioButton c2 = new JRadioButton("Since 1990");
        c2.setBounds(700, 250, 300, 50);
        quiz.add(c2);

        JRadioButton c3 = new JRadioButton("Since 1972");
        c3.setBounds(700,300,300,50);
        quiz.add(c3);

        JRadioButton c4 = new JRadioButton("Since 2005");
        c4.setBounds(700,350,300,50);
        quiz.add(c4);

        
        ButtonGroup dg = new ButtonGroup();
        dg.add(c1);
        dg.add(c2);
        dg.add(c3);
        dg.add(c4);


         confirm_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(c3.isSelected())
                {
                   JOptionPane.showMessageDialog(null, "correct");

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"incorrect");
                }
            }
        });

        //create fourth question
        JLabel ques_4 = new JLabel ("Hard** how many metric tons of e-waste does the world approx produce each yr?");
        ques_4.setBounds(700,500,500,30);
        quiz.add(ques_4);

        //create confirm bts
        JButton cofirm_4 = new JButton("Confirm Answer");
        cofirm_4.setBounds(700,760,200,30);
        quiz.add(cofirm_4);
        cofirm_4.addActionListener(null);
    
        //create options 
        JRadioButton l1 = new JRadioButton("200 million");
        l1.setBounds(700,550,300,50);
        quiz.add(l1);

        JRadioButton l2 = new JRadioButton("70 to 100 million");
        l2.setBounds(700, 600, 300, 50);
        quiz.add(l2);

        JRadioButton l3 = new JRadioButton("20 to 50 million");
        l3.setBounds(700,650,300,50);
        quiz.add(l3);

        JRadioButton l4 = new JRadioButton("5 to 10 million");
        l4.setBounds(700,700,300,50);
        quiz.add(l4);

        
        ButtonGroup eg = new ButtonGroup();
        eg.add(l1);
        eg.add(l2);
        eg.add(l3);
        eg.add(l4);


         cofirm_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(l3.isSelected())
                {
                   JOptionPane.showMessageDialog(null, "correct");

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"incorrect");
                }
            }
        });



        quiz.setLayout(null);
        quiz.setResizable(false);
        quiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quiz.setVisible(true);


    }
    
}
