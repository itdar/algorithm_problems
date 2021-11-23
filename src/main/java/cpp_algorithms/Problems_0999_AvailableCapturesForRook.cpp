#include <vector>

using namespace std;

// Process
//1. Input board 2d vector
//2. Find 'R' (Rook)
//3. Check 4 direction of Rook
//4. Return black pawn count
//5. Finish

class Solution {
public:
	int numRookCaptures(vector<vector<char>>& board) {
		int count = 0;
		int xCoord = 0;
		int yCoord = 0;

		this->findWhiteRook(board, xCoord, yCoord);

		this->findCapturedBlackPawn(board, xCoord, yCoord, count);

		return count;
	}
private:
	void findWhiteRook(vector<vector<char>>& board, int& xCoord, int& yCoord) {
		bool isDone = false;
		for (int i = 0; !isDone && i < board.size(); ++i) {
			for (int j = 0; !isDone && j < board[i].size(); ++j) {
				if (board[i][j] == 'R') {
					xCoord = i;
					yCoord = j;
					isDone = true;
				}
			}
		}
	}

	void findCapturedBlackPawn(vector<vector<char>>& board, const int xCoord, const int yCoord, int& count) {
		bool isDone = false;
		for (int i = xCoord + 1; !isDone && i < board.size(); ++i) {
			if (board[i][yCoord] != '.') {
				isDone = true;
				if (board[i][yCoord] == 'p')
					++count;
			}
		}
		isDone = false;
		for (int i = xCoord - 1; !isDone && i >= 0; --i) {
			if (board[i][yCoord] != '.') {
				isDone = true;
				if (board[i][yCoord] == 'p')
					++count;
			}
		}
		isDone = false;
		for (int j = yCoord + 1; !isDone && j < board[0].size(); ++j) {
			if (board[xCoord][j] != '.') {
				isDone = true;
				if (board[xCoord][j] == 'p')
					++count;
			}
		}
		isDone = false;
		for (int j = yCoord- 1; !isDone && j >= 0; --j) {
			if (board[xCoord][j] != '.') {
				isDone = true;
				if (board[xCoord][j] == 'p')
					++count;
			}
		}
	}
};


