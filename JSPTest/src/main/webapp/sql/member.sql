create table test_member (
	id varchar2(10) primary key,
	passwd varchar2(10),
	name varchar2(30),
	address varchar2(100)
);

create table test_board (
	seq number primary key,
	title varchar2(100),
	writer varchar2(100),
	content varchar2(500),
	write_date date,
	visit_cnt number
);

create sequence board_seq;