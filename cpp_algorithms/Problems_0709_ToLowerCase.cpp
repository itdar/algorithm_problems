#include <iostream>
#include <string>
#include <locale>


using namespace std;

class Solution {
public:
	string toLowerCase(string str) {
		for (int i = 0; i < str.size(); ++i)
		{
			if (str[i] >= 65 && str[i] <= 90)
				str[i] += 32;
		}
		return str;
	}

	// 	string toLowerCase(string str) {

	// 		std::locale loc;
	// 		for (std::string::size_type i = 0; i < str.length(); ++i)
	// 		{
	// 			str[i] = std::tolower(str[i], loc);
	// 		}
	// 		return str;
	// 	}
};


//int main(int argc, char *argv[]) {
//
//	string testString = "THESkdjSKEfa342asf21faFEWFDfsafSAF";
//
//	Solution sln;
//
//	cout << sln.toLowerCase(testString);
//	
//
//}