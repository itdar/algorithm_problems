#include <iostream>
#include <stdio.h>
#include <bitset>


using namespace std;

// Process
//1. Input int num
//2. Prepare mask bit all 1
//3. Shift right mask bit till smaller than int num
//4. Shift left once
//5. xor with int num and mask
//6. Return

class Solution {
public:
	int findComplement(int num) {

		bitset<32> numBit(num);
		bitset<32> maskBit(2147483647);

		int count = 1;
		uint32_t two = 1;

		while (two <= num)
		{
			++count;
			two *= 2;
		}

		count = 32 - count;

		while (count > 0)
		{
			maskBit = maskBit >> 1;
			--count;
		}
		//cout << numBit << " " << maskBit << endl;
		//cout << (int)(numBit.to_ulong()) << " " << (int)(maskBit.to_ulong()) << endl << endl;

		numBit ^= maskBit;

		return (int)(numBit.to_ulong());
	}
};


//int main(int argc, char *argv[]) {
//
//	//Solution sln;
//	
//	//cout << sln.findComplement(2) << endl << endl;
//	//cout << sln.findComplement(2147483647) << endl << endl;
//
//	//bitset<2> testBit2(7);
//
//	//cout << testBit2 << endl;
//	//cout << (int)(testBit2.to_ulong()) << endl << endl;
//
//	//bitset<8> testBit8(100);
//
//	//cout << testBit8 << endl;
//	//cout << (int)(testBit8.to_ulong()) << endl << endl;
//	//
//	//bitset<16> testBit16(100);
//
//	//cout << testBit16 << endl;
//	//cout << (int)(testBit16.to_ulong()) << endl << endl;
//
//	//bitset<32> testBit32(100);
//
//	//cout << testBit32 << endl;
//	//cout << (int)(testBit32.to_ulong()) << endl << endl;
//
//	//bitset<64> testBit64(100);
//
//	//cout << testBit64 << endl;
//	//cout << (int)(testBit64.to_ulong()) << endl << endl;
//}