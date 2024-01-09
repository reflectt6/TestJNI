#include <jni.h>
#include <stdio.h>
#include "org_example_JNISimpleDemo.h"

JNIEXPORT void JNICALL Java_org_example_JNISimpleDemo_print(JNIEnv *env, jobject obj)
{
	printf("Hello World!\n");
	return;
}