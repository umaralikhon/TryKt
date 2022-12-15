package workout.yandex.repo

import org.springframework.data.jpa.repository.JpaRepository
import workout.yandex.model.YaData

interface YaRepo: JpaRepository<YaData, Long> {
}