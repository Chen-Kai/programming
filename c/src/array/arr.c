/*
 * a.c
 *
 *  Created on: Aug 1, 2012
 *      Author: null
 */
#include <stdio.h>

#define N 5

int a[5][5] = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 }, {
		15, 16, 17, 18, 19 }, { 20, 21, 22, 23, 24 } };

int
func(int n);

#define MONTHS 12    // number of months in a year
#define YEARS   5    // number of years of data
void run_test() {
	float total = 0;

	const float rain[YEARS][MONTHS] =

	{

	{ 4.3, 4.3, 4.3, 3.0, 2.0, 1.2, 0.2, 0.2, 0.4, 2.4, 3.5, 6.6 },

	{ 8.5, 8.2, 1.2, 1.6, 2.4, 0.0, 5.2, 0.9, 0.3, 0.9, 1.4, 7.3 },

	{ 9.1, 8.5, 6.7, 4.3, 2.1, 0.8, 0.2, 0.2, 1.1, 2.3, 6.1, 8.4 },

	{ 7.2, 9.9, 8.4, 3.3, 1.2, 0.8, 0.4, 0.0, 0.6, 1.7, 4.3, 6.2 },

	{ 7.6, 5.6, 3.8, 2.8, 3.8, 0.2, 0.0, 0.0, 0.0, 1.3, 2.6, 5.2 }

	};

	int row = 0;
	int col = 0;

	float year_total = 0;
	float month_total = 0.0f;

	for (row = 0, total = 0; row < 5; row++) {
		for (col = 0, year_total = 0; col < 12; col++) {
			year_total += rain[row][col];
		}
		total += year_total;
		printf("%d\t : %.1f\n", 2000 + row, year_total);
	}

	for (col = 0; col < 12; col++) {
		month_total = 0;
		for (row = 0; row < 5; row++) {
			month_total += rain[row][col];
		}
		printf("col: %d -- %.1f\n", col + 1, month_total / 5.0);
	}

}

int func(int n) {
	if (n <= 1) {
		return 1;
	} else {
		return (n + func(n - 1));
	}
}
