insert into smart_card (id, name) values (1, '한자암기박사1');
insert into smart_card (id, name) values (2, '영어암송훈련');

insert into word (id, is_memorized, mean, word) values (1, false, '오얏나무 이', '李');
insert into word (id, is_memorized, mean, word) values (2, false, '창성할 창', '昌');
insert into word (id, is_memorized, mean, word) values (3, false, '빛날 희', '熙');
insert into word (id, is_memorized, mean, word) values (4, false, '개인적으로 클래식 음악은 따분한 것 같아요', 'Personally, I think classical music is boring');
insert into word (id, is_memorized, mean, word) values (5, false, '제 견해로는 우리는 늘 안전벨트를 매야 해요', 'In my view, we should always wear seatbelts');
insert into word (id, is_memorized, mean, word) values (6, false, '저의 경우는 누가 이기든 상관없어요', 'As for me, I don''t care who wins');

insert into smart_card_words (smart_card_id, words_id) values (1, 1);
insert into smart_card_words (smart_card_id, words_id) values (1, 2);
insert into smart_card_words (smart_card_id, words_id) values (1, 3);
insert into smart_card_words (smart_card_id, words_id) values (2, 4);
insert into smart_card_words (smart_card_id, words_id) values (2, 5);
insert into smart_card_words (smart_card_id, words_id) values (2, 6);