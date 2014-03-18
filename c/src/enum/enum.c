/*
 * enum.c
 *
 *  Created on: Mar 18, 2014
 *      Author: null
 */

#include "enum.h"

enum WEEKDAY {
	SUN = 0, MON, TUE, WED, THU, FRI, SAT
};

void testEnum() {
	enum WEEKDAY weekday = FRI;
	switch (weekday) {
	case SUN:
		puts("Sunday");
		break;
	case MON:
		puts("Monday");
		break;
	case TUE:
		puts("Tuesday");
		break;
	case WED:
		puts("Wednesday");
		break;
	case THU:
		puts("Thursday");
		break;
	case FRI:
		puts("Friday");
		break;
	case SAT:
		puts("Saturday");
		break;
	}
}

