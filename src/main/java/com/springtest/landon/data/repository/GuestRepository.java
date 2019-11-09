package com.springtest.landon.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.springtest.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {
    Optional<Guest> findById(Long id);
}