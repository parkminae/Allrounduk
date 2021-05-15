# SemiProject
### 프로젝트명: GYM CARRY
### 프로젝트 기간: 2021.03.19 ~ 04.22
---
## Contents
### 1.[개요](#개요) 
### 2.[사용기술 및 개발환경](#사용기술-및-개발환경)
### 3.[프로젝트 기능 구현](#프로젝트-기능-구현)
### 4.[설계](#설계)
### 5.[시연동영상](#시연동영상)
---
## 개요
### 기획의도
헬스장, 요가, 필라테스 등 실내운동시설 이용자들이
가격 등의 정보를 쉽게 찾고 비교할 수 있는 전문 웹 페이지를 만들고자 한다.
### 필요성
* 실내 체육시설에 대한 가격 공개 의무화 예정이나, 이를 비교할 수 있는 플랫폼을 찾아보기 힘듦
* 실내운동시설을 위치기반 서비스를 통해 가격비교를 한 눈에 할 수 있고, 실제 사용자들의 리얼후기를 통해 시설 선택을 함에 있어 도움이 되도록 함
* 전문성을 가진 강사진을 쉽게 찾을 수 있도록 도움을 줄 수 있음
---
## 사용기술 및 개발환경
* OS : window10
* IDE : Eclipse
* Language : JAVA, JSP, HTML5, CSS3, JavaScript, jQuery
* Middelware : TOMCAT
* DBMS : Oracle
* API : kakao
* Service：Zeplin, Googledocument, Slack
---
## 프로젝트 기능 구현
* 박민애
  * 메인 페이지 
    * 짐마켓(양도권 게시판) 목록(최신글 3개) 조회
    * 근딜(이벤트) 목록(최신글 3개) 조회
    * 근딜(이벤트) 게시글 등록 신청
      * 멀티 파일 업로드
  * 스토리(프로젝트소개) 페이지
    * 프론트엔드  
  * 근딜(이벤트) 페이지
    * 근딜 목록 조회
    * 근딜 상세 페이지
  * 관리자 페이지
    * 업체 목록 조회
    * 업체 리뷰 조회
    * 업체 리뷰 검색(카테고리별)
    * 업체 리뷰 수정
    * 업체 리뷰 삭제
    * 짐마켓 목록 조회
    * 짐마켓 게시글 검색
    * 짐마켓 게시글 삭제
    * 근딜 목록 조회
    * 근딜 게시글 검색(카테고리별)
    * 근딜 게시글 승인
    * 근딜 게시글 삭제
* 조혜리
  * 로그인, 회원가입 페이지
    * 아이디 찾기, 비밀번호 찾기 기능
    * 이메일 인증 기능
    * 로그아웃 기능
  * 관리자 페이지
    * 회원 목록 조회
    * 회원 검색(카테고리별)
    * 회원 삭제
* 전은하
  * 짐팟(지도) 페이지
    * 업체 검색
    * 업체 목록 조회
    * 지도 출력 및 업체 위치 표시
    * 업체 등록 
      * 멀티 파일 업로드
* 박다인
  * 짐팟 상세 페이지
    * 리뷰 목록 조회
    * 리뷰 등록
* 김윤정 
  * 짐마켓(양도글 게시판) 페이지
    * 짐마켓 목록 조회
    * 짐마켓 게시글 검색(카테고리별)
    * 짐마켓 상세 페이지
      * 짐마켓 게시글 찜하기
    * 짐마켓 게시글 등록
      * 멀티 파일 업로드
  * 마이페이지
    * 회원탈퇴
    * 회원 정보 수정
    * 내가 쓴 리뷰 목록 조회
    * 내가 쓴 리뷰 수정
    * 내가 쓴 리뷰 삭제
    * 내가 쓴 게시글 목록 조회
    * 내가 쓴 게시글 수정
    * 내가 쓴 게시글 삭제
* 최인철
  * 쪽지 팝업 페이지
    * 쪽지 보내기
    * 받은쪽지함, 보낸쪽지함
    * 답장하기
  * 마이페이지 
    * 찜목록 조회
    * 찜취소(삭제)
  * 관리자페이지
    * 업체 수정
    * 업체 삭제 
---
## 주요기능
1. 회원가입/회원탈퇴

2. 로그인/로그아웃

3. 아이디찾기/비밀번호찾기

4. 짐팟(내 주변 운동시설 찾기)

5. 업체 상세페이지

6. 짐마켓 (양도 게시글)

7. 짐마켓 상세페이지

8. 근딜 (업체 이벤트)

9. 근딜 상세페이지

10. 쪽지

11. 마이페이지

12. 관리자페이지
---
## 설계
### 1. 유즈케이스
  + 사용자
  <img src = "https://user-images.githubusercontent.com/82187403/118356213-13bd2800-b5af-11eb-928a-ea73c1b906b2.png" width="60%">
  + 관리자 
  <img src = "https://user-images.githubusercontent.com/82187403/118356216-1b7ccc80-b5af-11eb-8d65-0d796cf177e7.png" width="70%">

### 2. 플로우차트
  + 사용자
  
  <img src = "https://user-images.githubusercontent.com/82187403/118356221-1f105380-b5af-11eb-8fe0-6c8b632c4ebf.png" width="70%">
  + 관리자

  <img src = "https://user-images.githubusercontent.com/82187403/118356224-22a3da80-b5af-11eb-8bc5-549f4355abdf.png" width="60%">

### 3. ERD다이어그램
  <img src = "https://user-images.githubusercontent.com/82187403/118356169-eb352e00-b5ae-11eb-95f8-cad4461f2ce6.png" width="100%">
<hr>
<h2>시연동영상</h2>
<a href="https://drive.google.com/file/d/1ALsh9BqNvQlHkBbZoXKslN-ccia-E9bD/view?usp=sharing">[동영상보러가기]</a>
