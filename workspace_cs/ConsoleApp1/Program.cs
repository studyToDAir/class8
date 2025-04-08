using System;

namespace kr.or.human
{
    class Program
    {

        // 구조체
        struct Member
        {
            public string name;
            public int age;
        }

        Program()
        {
            Member member = new Member();
            member.age = 20;
        }

        // 소멸자
        ~Program()
        {

        }
        static void Main(string[] args)
        {

            Console.WriteLine("Hello World");

            /*
                sbyte -128~+127
                byte	 0~255
                long
                double
                bool
                int		-21억 ~ +21억	
                unsigned int 0~42억
                uint

                char
                float
                short
             */
            /*
            %
            >=
            && || !
            ++ --
            ? :
            & | << >>
            */
            int a = 10;
            int b = a++;
            if(a < b)
            {

            }

            int[] arr = { 1, 2, 3 };
            for(int i=0; i < arr.Length; i++)
            {

            }

            foreach(int i in arr) 
            {
            }

            /*
                c언어 출력문
                printf("hello");
                c++언어 출력문
                std::cout << "hello" << a << "world" << std::end;

             */

            try
            {
                a = 3;
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            } 
            finally
            {

            }
        }
        int test(int a)
        {
            return a;
        }
    }

}


