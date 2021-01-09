#include <vector>
#include <string>
#include <iostream>
#include <sstream>


using namespace std;

// Process
//1. Input int size n
//2. Iterate from 1 to n
// 2.1. push_back number
//3. Iterate from 1 to n
// 3.1. Add Fizz
//4. Iterate from 1 to n
// 4.1. Add Buzz
//5. Return answerVector

class Solution {
public:
	// 1st
	vector<string> fizzBuzz(int n) {
		vector<string> answerVector;
		int fizz = 1;
		int buzz = 1;
		for (int i = 1; i <= n; ++i)
		{
			if (fizz == 3 && buzz == 5)
			{
				answerVector.push_back("FizzBuzz");
				fizz = 0;
				buzz = 0;
			}
			else if (fizz == 3)
			{
				answerVector.push_back("Fizz");
				fizz = 0;
			}
			else if (buzz == 5)
			{
				answerVector.push_back("Buzz");
				buzz = 0;
			}
			else
			{
				answerVector.push_back(to_string(i));
			}
			++fizz;
			++buzz;
		}
		return answerVector;
	}

	// 2nd
	//vector<string> fizzBuzz(int n) {

	//	vector<string> answerVector;

	//	for (int i = 1; i <= n; ++i)
	//	{
	//		if (i % 15 == 0)
	//		{
	//			answerVector.push_back("FizzBuzz");
	//		}
	//		else if (i % 3 == 0)
	//		{
	//			answerVector.push_back("Fizz");
	//		}
	//		else if (i % 5 == 0)
	//		{
	//			answerVector.push_back("Buzz");
	//		}
	//		else 
	//		{
	//			answerVector.push_back(to_string(i));
	//		}
	//	}
	//	return answerVector;
	//}

	// 3rd
	//vector<string> fizzBuzz(int n) {

	//	vector<string> answerVector;

	//	for (int i = 1; i <= n; ++i)
	//	{
	//		answerVector.push_back(to_string(i));
	//	}

	//	for (int i = 3; i <= n; i+=3)
	//	{
	//		answerVector.at(i - 1) = "Fizz";
	//	}

	//	for (int i = 5; i <= n; i+=5)
	//	{
	//		answerVector.at(i - 1) = "Buzz";
	//	}

	//	for (int i = 15; i <= n; i += 15)
	//	{
	//		answerVector.at(i - 1) = "FizzBuzz";
	//	}

	//	return answerVector;
	//}
};


//int main(int argc, char *argv[]) {
//
//	Solution sln;
//	vector<string> returnVector = sln.fizzBuzz(25);
//
//	for (int i = 0; i < returnVector.size(); ++i)
//	{
//		cout << returnVector.at(i) << endl;
//	}
//
//}