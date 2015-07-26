package info.gorzkowski.demo.repository;

import info.gorzkowski.demo.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
