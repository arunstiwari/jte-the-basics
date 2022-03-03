@merge libraries {
    @merge sonarqube
}

commit_pipeline {
    clone_repo
    unit_test
    build
    static_code_analysis
    security_scan
}

acceptance_pipeline {
    clone_repo
    functional_testing
    performance_testing
    penetration_testing
}

release_pipeline {
    release_to_env
    smoke_testing
}

release_production {
    verify_change_request
    release_to_env
    smoke_testing
    update_service_now
}