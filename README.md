# Template system overlay android
[![Android CI](https://github.com/dark0ghost/template-system-overlay-android/actions/workflows/android.yml/badge.svg)](https://github.com/dark0ghost/template-system-overlay-android/actions/workflows/android.yml)
[![Activity](https://img.shields.io/github/commit-activity/m/dark0ghost/template-system-overlay-android)](https://github.com/dark0ghost/template-system-overlay-android/pulse)
[![GitHub issues](https://img.shields.io/github/issues/m/dark0ghost/template-system-overlay-android)](https://github.com/dark0ghost/template-system-overlay-android/issues)
[![GitHub release](https://img.shields.io/github/release/dark0ghost/template-system-overlay-android)](https://github.com/dark0ghost/template-system-overlay-android/releases/)
[![Github all releases](https://img.shields.io/github/downloads/dark0ghost/template-system-overlay-android/total.svg)](https://github.com/dark0ghost/template-system-overlay-android/releases/)
[![GitHub code size](https://img.shields.io/github/languages/code-size/dark0ghost/template-system-overlay-android?style=flat)](https://github.com/dark0ghost/template-system-overlay-android)

## About

This repository shows a pattern to implement  app on top of applications

## How use 

Work on top of windows is implemented through the creation and launch of [services](https://github.com/dark0ghost/template-system-overlay-android/blob/main/app/src/main/java/org/dark0ghost/template_on_top_of_applications/service/ButtonService.kt#L1)
where the service mapping happens in a function [onCreate](https://github.com/dark0ghost/template-system-overlay-android/blob/main/app/src/main/java/org/dark0ghost/template_on_top_of_applications/service/ButtonService.kt#L25). This [parameter](https://github.com/dark0ghost/template-system-overlay-android/blob/main/app/src/main/java/org/dark0ghost/template_on_top_of_applications/service/ButtonService.kt#L31-L37) is responsible for the display settings of the service (read about [WindowManager.LayoutParams](https://developer.android.com/reference/android/view/WindowManager.LayoutParams)). This [param](https://github.com/dark0ghost/template-system-overlay-android/blob/main/app/src/main/java/org/dark0ghost/template_on_top_of_applications/service/ButtonService.kt#L3-L39) for the position on display. This [layout](https://github.com/dark0ghost/template-system-overlay-android/blob/main/app/src/main/res/layout/revolt.xml) for drawing [service](https://github.com/dark0ghost/template-system-overlay-android/blob/main/app/src/main/java/org/dark0ghost/template_on_top_of_applications/service/ButtonService.kt#L1)

## Demonstration of functionality of a button button
<image src="https://raw.githubusercontent.com/dark0ghost/template-system-overlay-android/main/static/app.png">

  
## Application template
 <image src="https://raw.githubusercontent.com/dark0ghost/template-system-overlay-android/main/static/service.png" width="500" height="900" > 
  
