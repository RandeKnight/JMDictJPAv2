ALTER TABLE AUDIT DROP FOREIGN KEY FK_AUDIT_ENTRY_ENT_SEQ
ALTER TABLE SENSE DROP FOREIGN KEY FK_SENSE_ENTRY_ENT_SEQ
ALTER TABLE UNICODE DROP FOREIGN KEY FK_UNICODE_ENTRY_ENT_SEQ
ALTER TABLE LSOURCE DROP FOREIGN KEY FK_LSOURCE_SENSE_ENT_SEQ
ALTER TABLE Character_DICNUMBERS DROP FOREIGN KEY FK_Character_DICNUMBERS_Character_UNICODE
DROP TABLE AUDIT
DROP TABLE Characters
DROP TABLE SENSE
DROP TABLE UNICODE
DROP TABLE ENTRY
DROP TABLE LSOURCE
DROP TABLE Character_DICNUMBERS
