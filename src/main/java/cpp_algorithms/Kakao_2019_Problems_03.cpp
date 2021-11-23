#include <string>
#include <vector>
#include <iostream>

using namespace std;

// 처리과정
// 1. 2d vector key, lock 입력받는다.
// 2. lock upscale 만들어둔다.
// 3. 각 방향 key indexes 만들어둔다.
// 4. 열리는지 확인한다.
// 5. 여부 반환
// 6. 끝

bool solution(vector<vector<int>> key, vector<vector<int>> lock) {
	bool answer = false;

	int actualKeyWidth = key.size();
	int actualLockWidth = lock.size();
	int emptyWidth = lock.size() - 1;

	// 2. upscale
	vector<vector<int>> dynamicLock;
	for (int i = 0; i < actualLockWidth + (emptyWidth * 2); ++i) {
		vector<int> tempVec;
		for (int j = 0; j < actualLockWidth + (emptyWidth * 2); ++j) {
			tempVec.push_back(0);
		}
		dynamicLock.push_back(tempVec);
	}
	int s = 0;
	int d;
	for (int i = emptyWidth; i < actualLockWidth + emptyWidth; ++i) {
		d = 0;
		for (int j = emptyWidth; j < actualLockWidth + emptyWidth; ++j) {
			dynamicLock[i][j] = lock[s][d];
			++d;
		}
		++s;
	}

	// 3. diff direction key indexes
	vector<vector<int>> keyIndexes;
	vector<vector<int>> key2;
	vector<vector<int>> key2Indexes;
	vector<vector<int>> key3;
	vector<vector<int>> key3Indexes;
	vector<vector<int>> key4;
	vector<vector<int>> key4Indexes;
	for (int i = 0; i < key.size(); ++i) {
		for (int j = 0; j < key[i].size(); ++j) {
			if (key[i][j] == 1) {
				vector<int> tempVec;
				tempVec.push_back(i);
				tempVec.push_back(j);
				keyIndexes.push_back(tempVec);
			}
		}
	}
	for (int i = 0; i < key.size(); ++i) {
		vector<int> tempVec1;
		for (int j = key[i].size()-1; j >= 0; --j) {
			tempVec1.push_back(key[j][i]);
		}
		key2.push_back(tempVec1);
	}
	for (int i = 0; i < key2.size(); ++i) {
		for (int j = 0; j < key2[i].size(); ++j) {
			if (key2[i][j] == 1) {
				vector<int> tempVec;
				tempVec.push_back(i);
				tempVec.push_back(j);
				key2Indexes.push_back(tempVec);
			}
		}
	}
	for (int i = 0; i < key2.size(); ++i) {
		vector<int> tempVec1;
		for (int j = key2[i].size() - 1; j >= 0; --j) {
			tempVec1.push_back(key2[j][i]);
		}
		key3.push_back(tempVec1);
	}
	for (int i = 0; i < key3.size(); ++i) {
		for (int j = 0; j < key3[i].size(); ++j) {
			if (key3[i][j] == 1) {
				vector<int> tempVec;
				tempVec.push_back(i);
				tempVec.push_back(j);
				key3Indexes.push_back(tempVec);
			}
		}
	}
	for (int i = 0; i < key3.size(); ++i) {
		vector<int> tempVec1;
		for (int j = key3[i].size() - 1; j >= 0; --j) {
			tempVec1.push_back(key3[j][i]);
		}
		key4.push_back(tempVec1);
	}
	for (int i = 0; i < key4.size(); ++i) {
		for (int j = 0; j < key4[i].size(); ++j) {
			if (key4[i][j] == 1) {
				vector<int> tempVec;
				tempVec.push_back(i);
				tempVec.push_back(j);
				key4Indexes.push_back(tempVec);
			}
		}
	}

	// 4.
	bool isOpened = false;
	for (int i = 0; !isOpened && i < dynamicLock.size() - (key.size() - 1); ++i) {
		for (int j = 0; !isOpened && j < dynamicLock[i].size() - (key.size() - 1); ++j) {
			vector<vector<int>> tempDynamic;
			for (int m = 0; m < dynamicLock.size(); ++m) {
				vector<int> tempVec;
				for (int n = 0; n < dynamicLock[m].size(); ++n) {
					tempVec.push_back(dynamicLock[m][n]);
				}
				tempDynamic.push_back(tempVec);
			}
			for (int m = 0; m < keyIndexes.size(); ++m) {
				if (tempDynamic[i + keyIndexes[m][0]][j + keyIndexes[m][1]] == 1) {
					tempDynamic[i + keyIndexes[m][0]][j + keyIndexes[m][1]] = 0;
				}
				else {
					tempDynamic[i + keyIndexes[m][0]][j + keyIndexes[m][1]] = 1;
				}
			}
			// Check if it can be unlocked
			bool ongoing = true;
			for (int i = emptyWidth; ongoing && i < emptyWidth + actualLockWidth; ++i) {
				for (int j = emptyWidth; ongoing && j < emptyWidth + actualLockWidth; ++j) {
					if (tempDynamic[i][j] != 1)
						ongoing = false;
				}
			}
			if (ongoing)
				isOpened = true;
		}
	}
	for (int i = 0; !isOpened && i < dynamicLock.size() - (key.size() - 1); ++i) {
		for (int j = 0; !isOpened && j < dynamicLock[i].size() - (key.size() - 1); ++j) {
			vector<vector<int>> tempDynamic;
			for (int m = 0; m < dynamicLock.size(); ++m) {
				vector<int> tempVec;
				for (int n = 0; n < dynamicLock[m].size(); ++n) {
					tempVec.push_back(dynamicLock[m][n]);
				}
				tempDynamic.push_back(tempVec);
			}
			for (int m = 0; m < key2Indexes.size(); ++m) {
				if (tempDynamic[i + key2Indexes[m][0]][j + key2Indexes[m][1]] == 1) {
					tempDynamic[i + key2Indexes[m][0]][j + key2Indexes[m][1]] = 0;
				}
				else {
					tempDynamic[i + key2Indexes[m][0]][j + key2Indexes[m][1]] = 1;
				}
			}
			// Check if it can be unlocked
			bool ongoing = true;
			for (int i = emptyWidth; ongoing && i < emptyWidth + actualLockWidth; ++i) {
				for (int j = emptyWidth; ongoing && j < emptyWidth + actualLockWidth; ++j) {
					if (tempDynamic[i][j] != 1)
						ongoing = false;
				}
			}
			if (ongoing)
				isOpened = true;
		}
	}
	for (int i = 0; !isOpened && i < dynamicLock.size() - (key.size() - 1); ++i) {
		for (int j = 0; !isOpened && j < dynamicLock[i].size() - (key.size() - 1); ++j) {
			vector<vector<int>> tempDynamic;
			for (int m = 0; m < dynamicLock.size(); ++m) {
				vector<int> tempVec;
				for (int n = 0; n < dynamicLock[m].size(); ++n) {
					tempVec.push_back(dynamicLock[m][n]);
				}
				tempDynamic.push_back(tempVec);
			}
			for (int m = 0; m < key3Indexes.size(); ++m) {
				if (tempDynamic[i + key3Indexes[m][0]][j + key3Indexes[m][1]] == 1) {
					tempDynamic[i + key3Indexes[m][0]][j + key3Indexes[m][1]] = 0;
				}
				else {
					tempDynamic[i + key3Indexes[m][0]][j + key3Indexes[m][1]] = 1;
				}
			}
			// Check if it can be unlocked
			bool ongoing = true;
			for (int i = emptyWidth; ongoing && i < emptyWidth + actualLockWidth; ++i) {
				for (int j = emptyWidth; ongoing && j < emptyWidth + actualLockWidth; ++j) {
					if (tempDynamic[i][j] != 1)
						ongoing = false;
				}
			}
			if (ongoing)
				isOpened = true;
		}
	}
	for (int i = 0; !isOpened && i < dynamicLock.size() - (key.size() - 1); ++i) {
		for (int j = 0; !isOpened && j < dynamicLock[i].size() - (key.size() - 1); ++j) {
			vector<vector<int>> tempDynamic;
			for (int m = 0; m < dynamicLock.size(); ++m) {
				vector<int> tempVec;
				for (int n = 0; n < dynamicLock[m].size(); ++n) {
					tempVec.push_back(dynamicLock[m][n]);
				}
				tempDynamic.push_back(tempVec);
			}
			for (int m = 0; m < key4Indexes.size(); ++m) {
				if (tempDynamic[i + key4Indexes[m][0]][j + key4Indexes[m][1]] == 1) {
					tempDynamic[i + key4Indexes[m][0]][j + key4Indexes[m][1]] = 0;
				}
				else {
					tempDynamic[i + key4Indexes[m][0]][j + key4Indexes[m][1]] = 1;
				}
			}
			// Check if it can be unlocked
			bool ongoing = true;
			for (int i = emptyWidth; ongoing && i < emptyWidth + actualLockWidth; ++i) {
				for (int j = emptyWidth; ongoing && j < emptyWidth + actualLockWidth; ++j) {
					if (tempDynamic[i][j] != 1)
						ongoing = false;
				}
			}
			if (ongoing)
				isOpened = true;
		}
	}

	//// dynamicPlate test code
	//cout << endl << endl;
	//for (int i = 0; i < dynamicLock.size(); ++i) {
	//	for (int j = 0; j < dynamicLock[i].size(); ++j) {
	//		cout << dynamicLock[i][j] << " ";
	//	}
	//	cout << endl;
	//}


	return isOpened;
}

//int main() {
//	vector<vector<int>> testKey1;
//	vector<int> tempVec11 = { 0,0,0 };
//	vector<int> tempVec12 = { 1,0,0 };
//	vector<int> tempVec13 = { 0,1,1 };
//	testKey1.push_back(tempVec11);
//	testKey1.push_back(tempVec12);
//	testKey1.push_back(tempVec13);
//
//	vector<vector<int>> testLock1;
//	vector<int> tempVec21 = { 1,1,1 };
//	vector<int> tempVec22 = { 0,1,1 };
//	vector<int> tempVec23 = { 1,0,1 };
//	testLock1.push_back(tempVec21);
//	testLock1.push_back(tempVec22);
//	testLock1.push_back(tempVec23);
//	
//	cout << endl;
//	if (solution(testKey1, testLock1)) {
//		cout << "Opened!" << endl;
//	}
//	else {
//		cout << "Locked" << endl;
//	}
//
//
//	return 0;
//}