using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace WindowsFormsCalc
{
    public partial class Form1 : Form
    {
        float num1 = 0; // 첫번째 숫자
        string op = null;
        List<float> numList = new List<float>();
        List<float> opList = new List<float>();

        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            display.Text += "1";
            float num = float.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = ""+num;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            display.Text += "2";
            float num = float.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            display.Text += "3";
            float num = float.Parse(display.Text);
            //int num = Int32.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            display.Text += "4";
            float num = float.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            display.Text += "5";
            float num = float.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            display.Text += "6";
            float num = float.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button7_Click(object sender, EventArgs e)
        {
            display.Text += "7";
            float num = float.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button8_Click(object sender, EventArgs e)
        {
            display.Text += "8";
            float num = float.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button9_Click(object sender, EventArgs e)
        {
            display.Text += "9";
            float num = float.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button14_Click(object sender, EventArgs e)
        {
            display.Text += "0";
            float num = float.Parse(display.Text);
            display.Text = "" + num;
        }

        //bool hasDot = false;
        private void button15_Click(object sender, EventArgs e)
        {
            //if (!hasDot)
            //{
            //    display.Text += ".";
            //    hasDot = true;
            //}

            if(display.Text.IndexOf(".") == -1)
            {
                display.Text += ".";
            }

        }

        private void button13_Click(object sender, EventArgs e)
        {
            // 지금까지 적은 숫자를 저장
            this.num1 = float.Parse(display.Text);
            // 연산자 저장
            this.op = "+";
            display.Text = "0";
        }

        private void button12_Click(object sender, EventArgs e)
        {
            this.num1 = float.Parse(display.Text);
            this.op = "-";
            display.Text = "0";
        }

        private void button11_Click(object sender, EventArgs e)
        {
            this.num1 = float.Parse(display.Text);
            this.op = "*";
            display.Text = "0";
        }

        private void button10_Click(object sender, EventArgs e)
        {
            this.num1 = float.Parse(display.Text);
            this.op = "/";
            display.Text = "0";
        }

        private void button17_Click(object sender, EventArgs e)
        {
            float num2 = float.Parse(display.Text);
            if(op != null)
            {
                float result = 0;
                //    if(op == "+")
                if ("+".Equals(op))
                {
                    result = this.num1 + num2;
                }
                else if ("-".Equals(op))
                {
                    result = this.num1 - num2;
                }
                else if ("*".Equals(op))
                {
                    result = this.num1 * num2;
                }
                else if ("/".Equals(op))
                {
                    result = this.num1 / num2;
                }

//                display.Text = ""+result;
                display.Text = result.ToString();

                // 마지막 넣은 숫자를 기억해서
                // 다시 =을 눌렀을 때 반복하게
                //this.num1 = num2;
            }
        }

        private void button16_Click(object sender, EventArgs e)
        {
            this.num1 = 0;
            this.op = null;
            display.Text = "0";
        }
    }
}
