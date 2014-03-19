/*
 * env.c
 *
 *  Created on: Mar 18, 2014
 *      Author: null
 */
#include <stdio.h>
#include <stdlib.h>
#include "env.h"

void printEnvInfo() {
	puts(getenv("PWD"));
}
